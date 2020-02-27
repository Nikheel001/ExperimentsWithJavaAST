package com.headshot;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;

import com.sun.source.tree.BlockTree;
import com.sun.source.tree.ClassTree;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;
import com.sun.source.util.JavacTask;
import com.sun.source.util.TreeScanner;
import com.sun.source.util.Trees;
import com.sun.tools.javac.api.JavacTool;

public class SampleAstTry {

	public static String readCode(String path) {

		StringBuffer sb = new StringBuffer();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String nextLine;
			while ((nextLine = br.readLine()) != null) {
				sb.append(nextLine);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sb.toString();
	}

	public static void main(String[] args) {

//		String code = readCode("C:\\Users\\home\\eclipse-workspace_2019\\SampleASTjava\\src\\com\\test_it\\Input.java");
//		System.out.println(code);

		JavacTool tool = JavacTool.create();
		StandardJavaFileManager sjfm = tool.getStandardFileManager(null, null, null);
		Iterable<? extends JavaFileObject> files = sjfm.getJavaFileObjectsFromFiles(Arrays.asList(
				new File("C:\\Users\\home\\eclipse-workspace_2019\\SampleASTjava\\src\\com\\test_it\\Input.java")));
		JavacTask task = tool.getTask(null, sjfm, null, null, null, files);
		try {
			Iterable<? extends CompilationUnitTree> trees = task.parse();

//			Trees treeUtil = Trees.instance(task);

			for (CompilationUnitTree x : trees) {
				x.accept(new MyCustomeTreeVisitorImpl<Void, Void>(), null);
			}
			
			System.out.println("Tow ways  ------- :)");
			
			for (CompilationUnitTree x : trees) {
				x.accept(new MyCustomTreeScanner<Object, Object>(), null);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		CompilationUnitTree cut = getCompilationUnitTree(code);

	}
}
