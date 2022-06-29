package compiler.lib;


public interface Node {
    //Uso un binder per dire che il tipo S è locale
    <S> S accept(BaseASTVisitor<S> visitor);
}
	

	  