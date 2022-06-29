package compiler;

import compiler.lib.*;

public class AST {
	//Radice
	public static class ProgNode implements Node {
		Node exp; //Figlio espressione principale del programma
		ProgNode(Node e) { exp=e; }

		//Uso accept per poter implementare la chiamata polimorfica al Node corretto in fase di visita dell'AST
		//Per un esempio di uso vedi PrintASTVisitor.
		@Override
		public <S> S accept(BaseASTVisitor<S> visitor) {
			return visitor.visitNode(this);
		}
	}

	//Nodo somma
	public static class PlusNode implements Node {
		Node left; //Figlio sinistro
		Node right; //Figlio destro
		PlusNode(Node l, Node r) { left=l; right=r; }

		@Override
		public <S> S accept(BaseASTVisitor<S> visitor) {
			return visitor.visitNode(this);
		}
	}

	public static class TimesNode implements Node {
		Node left;
		Node right;
		TimesNode(Node l, Node r) { left=l; right=r; }

		@Override
		public <S> S accept(BaseASTVisitor<S> visitor) {
			return visitor.visitNode(this);
		}
	}

	//EC - Esercizio per casa
	public static class EqualNode implements Node {
		Node left;
		Node right;
		EqualNode(Node l, Node r) { left=l; right=r; }

		@Override
		public <S> S accept(BaseASTVisitor<S> visitor) {
			return visitor.visitNode(this);
		}
	}

	//EC - Esercizio per casa
	public static class IfNode implements Node {
		Node cond;
		Node th;
		Node el;
		IfNode(Node c, Node t, Node e) { cond=c; th=t; el=e; }

		@Override
		public <S> S accept(BaseASTVisitor<S> visitor) {
			return visitor.visitNode(this);
		}
	}

	//EC - Esercizio per casa
	//Nodo foglia per il valore booleano
	public static class BoolNode implements Node {
		Boolean val;
		BoolNode(Boolean b) { val=b; }

		@Override
		public <S> S accept(BaseASTVisitor<S> visitor) {
			return visitor.visitNode(this);
		}
	}

	//EC - Esercizio per casa
	//Nodo foglia per la stampa
	public static class PrintNode implements Node {
		Node exp;
		PrintNode(Node p) { exp=p; }

		@Override
		public <S> S accept(BaseASTVisitor<S> visitor) {
			return visitor.visitNode(this);
		}
	}

	//Nodo foglia per il valore intero
	public static class IntNode implements Node {
		Integer val;
		IntNode(Integer n) { val=n; }

		@Override
		public <S> S accept(BaseASTVisitor<S> visitor) {
			return visitor.visitNode(this);
		}
	}
}
