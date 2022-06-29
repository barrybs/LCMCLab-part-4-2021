package compiler;

import compiler.AST.*;
import compiler.lib.BaseASTVisitor;
import compiler.lib.Node;

public class PrintASTVisitor extends BaseASTVisitor<Void> {

	PrintASTVisitor(){super(true);}

	public Void visitNode(ProgNode n) {
		printNode(n);
		visit(n.exp); //Visito il figlio (può essere qualsiasi tipo di Node). Grazie al metodo accept si riesce a implementare il polimorfismo in modo
		              //da visitare il nodo del tipo specifico che mi interessa.
		return null;
	}

	public Void visitNode(PlusNode n) {
		printNode(n);
		visit(n.left);
		visit(n.right);
		return null;
	}

	public Void visitNode(TimesNode n) {
		printNode(n);
		visit(n.left);
		visit(n.right);
		return null;
	}

	public Void visitNode(EqualNode n) {
		printNode(n);
		visit(n.left);
		visit(n.right);
		return null;
	}

	public Void visitNode(IfNode n) {
		printNode(n);
		visit(n.cond);
		visit(n.th);
		visit(n.el);
		return null;
	}

	public Void visitNode(BoolNode n) {
		printNode(n,n.val.toString());
		return null;
	}

	public Void visitNode(PrintNode n) {
		printNode(n.exp);
		return null;
	}

	public Void visitNode(IntNode n) {
		printNode(n,n.val.toString());
		return null;
	}
}








