package com.headshot;

import com.sun.source.tree.BlockTree;
import com.sun.source.tree.ClassTree;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.Tree;
import com.sun.source.util.TreeScanner;

public class MyCustomTreeScanner<A, B> extends TreeScanner<A, B> {

	@Override
	public A visitCompilationUnit(CompilationUnitTree node, B x) {
		System.out.println(node.getPackageName());
		return null;
	}
	
	@Override
	public A visitMethod(MethodTree node, B x) {
		System.out.println(node.getName());
		return null;
	}

	@Override
	public A visitBlock(BlockTree node, B x) {
		System.out.println(node.toString());
		return null;
	}

	@Override
	public A visitClass(ClassTree node, B x) {
		System.out.println(node.getSimpleName());

		for (Tree i : node.getMembers()) {
			if (i instanceof MethodTree) {
				this.visitMethod((MethodTree) i, x);
			} else if (i instanceof BlockTree) {
				this.visitBlock((BlockTree) node, x);
			}
		}
		return null;
	}
}
