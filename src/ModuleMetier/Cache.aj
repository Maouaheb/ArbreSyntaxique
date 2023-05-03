package ModuleMetier;

public aspect Cache {
	
// l'attribut cache et si il est valide ou pas
private int Expression.cache;
private Boolean Expression.cacheValide=false;
public int Expression.getCache() {
	return cache;
}
public void Expression.setCache(int c) {
 this.cache=c;
}

public void Expression.setCacheValide(boolean b){
	this.cacheValide=b;
}
public boolean Expression.getCacheValide(){
	return cacheValide;
}
// la notion ancetre et methode pour invalider le pere si le fils n'est pas valide
private Expression Expression.father=null;
public void Expression.setFather(Expression exp) {
	this.father=exp;
}
public Expression Expression.getFather(){
	return father;
}

pointcut LienFather(Plus plus) : this(plus) && execution(Plus.new(Expression,Expression));
after(Plus plus) returning() : LienFather(plus) {
	
	plus.left().setFather(plus);
	plus.right().setFather(plus);
}





public void Expression.invalidateCache(){
	// le fils n'est pas valide alors tous ces parents son invalides
	cacheValide=false;
	if(this.getFather()!=null) {
		this.getFather().invalidateCache();
	}
}

pointcut changeValue(Expression exp) :target(exp) && ( call(void Number.setValue(int)) || call(void Plus.setRight(Expression)) || call(void Plus.setLeft(Expression)));
after(Expression exp) returning() : changeValue(exp) {
	exp.invalidateCache();
}
pointcut evaluation(Expression exp) : target(exp)&& call(int Expression.eval());
int around(Expression exp) : evaluation(exp) {
	if(! exp.cacheValide) {
		int result=proceed(exp);
		exp.setCache(result);
		exp.setCacheValide(true);
	}
	return exp.getCache();
}


}
