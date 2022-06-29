package compiler.lib;

import compiler.AST.*;
import compiler.lib.Node;

//La classe è concreta perché non siamo costretti a implementare le visite di tutti i nodi
//Lancio l'eccezione nelle implementazioni di default perché dobbiamo stare attenti che non venga eseguita una delle
//implementazioni di default che non abbiamo implementato. L'eccezione ci consente di accorgerci di esserci dimenticati di implementarla.
//Molto utile per il debug per le visite di alberi molto complessi.
public class BaseASTVisitor<S>{

	protected BaseASTVisitor() {}
	protected BaseASTVisitor(boolean p) { print=p; } //Costruttore che setta la modalità di stampa

	String indent;
	protected boolean print=false;

	protected void printNode(Node n) {
		System.out.println(indent+extractNodeName(n.getClass().getName()));
	}

	protected void printNode(Node n, String s) {
		System.out.println(indent+extractNodeName(n.getClass().getName())+": "+s);
	}

	//Usa la reflection per individuare il node
	String extractNodeName(String s) { // s is in the form compiler.AST$NameNode
		return s.substring(s.lastIndexOf('$')+1,s.length()-4);
	}

	//PrintASTVisitor() { super(true); }


	//performs the "n" specific visit
	public S visit(Node n) {
		if (print) {
			String temp = indent;
			indent = (indent == null) ? "" : indent + "  ";
			S result = visitByAcc(n);
			indent = temp;
			return result;
		}
		else return visitByAcc(n);
	}

	public S visitByAcc(Node n) {
		return n.accept(this); //performs the "n"-specific visit
	}
	
	public S visitNode(ProgNode n) {
		throw new UnimplException();
	}
	public S visitNode(PlusNode n) {
		throw new UnimplException();
	}
	public S visitNode(TimesNode n) {
		throw new UnimplException();
	}
	public S visitNode(IntNode n) {
		throw new UnimplException();
	}
	public S visitNode(EqualNode n) {
		throw new UnimplException();
	}
	public S visitNode(BoolNode n) {
		throw new UnimplException();
	}
	public S visitNode(PrintNode n) {
		throw new UnimplException();
	}
	public S visitNode(IfNode n) {
		throw new UnimplException();
	}

}








