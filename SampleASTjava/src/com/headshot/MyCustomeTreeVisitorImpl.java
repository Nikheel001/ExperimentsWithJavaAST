package com.headshot;

import com.sun.source.tree.AnnotatedTypeTree;
import com.sun.source.tree.AnnotationTree;
import com.sun.source.tree.ArrayAccessTree;
import com.sun.source.tree.ArrayTypeTree;
import com.sun.source.tree.AssertTree;
import com.sun.source.tree.AssignmentTree;
import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.BlockTree;
import com.sun.source.tree.BreakTree;
import com.sun.source.tree.CaseTree;
import com.sun.source.tree.CatchTree;
import com.sun.source.tree.ClassTree;
import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.CompoundAssignmentTree;
import com.sun.source.tree.ConditionalExpressionTree;
import com.sun.source.tree.ContinueTree;
import com.sun.source.tree.DoWhileLoopTree;
import com.sun.source.tree.EmptyStatementTree;
import com.sun.source.tree.EnhancedForLoopTree;
import com.sun.source.tree.ErroneousTree;
import com.sun.source.tree.ExpressionStatementTree;
import com.sun.source.tree.ForLoopTree;
import com.sun.source.tree.IdentifierTree;
import com.sun.source.tree.IfTree;
import com.sun.source.tree.ImportTree;
import com.sun.source.tree.InstanceOfTree;
import com.sun.source.tree.IntersectionTypeTree;
import com.sun.source.tree.LabeledStatementTree;
import com.sun.source.tree.LambdaExpressionTree;
import com.sun.source.tree.LiteralTree;
import com.sun.source.tree.MemberReferenceTree;
import com.sun.source.tree.MemberSelectTree;
import com.sun.source.tree.MethodInvocationTree;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.ModifiersTree;
import com.sun.source.tree.NewArrayTree;
import com.sun.source.tree.NewClassTree;
import com.sun.source.tree.ParameterizedTypeTree;
import com.sun.source.tree.ParenthesizedTree;
import com.sun.source.tree.PrimitiveTypeTree;
import com.sun.source.tree.ReturnTree;
import com.sun.source.tree.SwitchTree;
import com.sun.source.tree.SynchronizedTree;
import com.sun.source.tree.ThrowTree;
import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;
import com.sun.source.tree.TryTree;
import com.sun.source.tree.TypeCastTree;
import com.sun.source.tree.TypeParameterTree;
import com.sun.source.tree.UnaryTree;
import com.sun.source.tree.UnionTypeTree;
import com.sun.source.tree.VariableTree;
import com.sun.source.tree.WhileLoopTree;
import com.sun.source.tree.WildcardTree;

public class MyCustomeTreeVisitorImpl<R, P> implements TreeVisitor<R, P> {

	@Override
	public R visitAnnotatedType(AnnotatedTypeTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl AnnotatedTypeTree");
		return null;
	}

	@Override
	public R visitAnnotation(AnnotationTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl AnnotationTree");
		return null;
	}

	@Override
	public R visitArrayAccess(ArrayAccessTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl ArrayAccessTree");
		return null;
	}

	@Override
	public R visitArrayType(ArrayTypeTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl ArrayTypeTree");
		return null;
	}

	@Override
	public R visitAssert(AssertTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl AssertTree");
		return null;
	}

	@Override
	public R visitAssignment(AssignmentTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl AssignmentTree");
		return null;
	}

	@Override
	public R visitBinary(BinaryTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl BinaryTree");
		return null;
	}

	@Override
	public R visitBlock(BlockTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl BlockTree");
		return null;
	}

	@Override
	public R visitBreak(BreakTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl BreakTree");
		return null;
	}

	@Override
	public R visitCase(CaseTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl CaseTree");
		return null;
	}

	@Override
	public R visitCatch(CatchTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl CatchTree");
		return null;
	}

	@Override
	public R visitClass(ClassTree arg0, P arg1) {
		System.out.println(arg0.getSimpleName() + " ----Visited via Impl ClassTree");
		return null;
	}

	@Override
	public R visitCompilationUnit(CompilationUnitTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl CompilationUnitTree");
		System.out.println(arg0.getPackageName() + " <==");
		
		return null;
	}

	@Override
	public R visitCompoundAssignment(CompoundAssignmentTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl CompoundAssignmentTree");
		return null;
	}

	@Override
	public R visitConditionalExpression(ConditionalExpressionTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl ConditionalExpressionTree");
		return null;
	}

	@Override
	public R visitContinue(ContinueTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl ContinueTree");
		return null;
	}

	@Override
	public R visitDoWhileLoop(DoWhileLoopTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl DoWhileLoopTree");
		return null;
	}

	@Override
	public R visitEmptyStatement(EmptyStatementTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl EmptyStatementTree");
		return null;
	}

	@Override
	public R visitEnhancedForLoop(EnhancedForLoopTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl EnhancedForLoopTree");
		return null;
	}

	@Override
	public R visitErroneous(ErroneousTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl ErroneousTree");
		return null;
	}

	@Override
	public R visitExpressionStatement(ExpressionStatementTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl ExpressionStatementTree");
		return null;
	}

	@Override
	public R visitForLoop(ForLoopTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl ForLoopTree");
		return null;
	}

	@Override
	public R visitIdentifier(IdentifierTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl IdentifierTree");
		return null;
	}

	@Override
	public R visitIf(IfTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl IfTree");
		return null;
	}

	@Override
	public R visitImport(ImportTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl ImportTree");
		return null;
	}

	@Override
	public R visitInstanceOf(InstanceOfTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl InstanceOfTree");
		return null;
	}

	@Override
	public R visitIntersectionType(IntersectionTypeTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl IntersectionTypeTree");
		return null;
	}

	@Override
	public R visitLabeledStatement(LabeledStatementTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl LabeledStatementTree");
		return null;
	}

	@Override
	public R visitLambdaExpression(LambdaExpressionTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl LambdaExpressionTree");
		return null;
	}

	@Override
	public R visitLiteral(LiteralTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl LiteralTree");
		return null;
	}

	@Override
	public R visitMemberReference(MemberReferenceTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl MemberReferenceTree");
		return null;
	}

	@Override
	public R visitMemberSelect(MemberSelectTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl MemberSelectTree");
		return null;
	}

	@Override
	public R visitMethod(MethodTree arg0, P arg1) {
		System.out.println(arg0.getName() + " ----Visited via Impl MethodTree");
		return null;
	}

	@Override
	public R visitMethodInvocation(MethodInvocationTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl MethodInvocationTree");
		return null;
	}

	@Override
	public R visitModifiers(ModifiersTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl ModifiersTree");
		return null;
	}

	@Override
	public R visitNewArray(NewArrayTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl NewArrayTree");
		return null;
	}

	@Override
	public R visitNewClass(NewClassTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl NewClassTree");
		return null;
	}

	@Override
	public R visitOther(Tree arg0, P arg1) {
		System.out.println(" ----Visited via Impl Tree");
		return null;
	}

	@Override
	public R visitParameterizedType(ParameterizedTypeTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl ParameterizedTypeTree");
		return null;
	}

	@Override
	public R visitParenthesized(ParenthesizedTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl ParenthesizedTree");
		return null;
	}

	@Override
	public R visitPrimitiveType(PrimitiveTypeTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl PrimitiveTypeTree");
		return null;
	}

	@Override
	public R visitReturn(ReturnTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl ReturnTree");
		return null;
	}

	@Override
	public R visitSwitch(SwitchTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl SwitchTree");
		return null;
	}

	@Override
	public R visitSynchronized(SynchronizedTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl SynchronizedTree");
		return null;
	}

	@Override
	public R visitThrow(ThrowTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl ThrowTree");
		return null;
	}

	@Override
	public R visitTry(TryTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl TryTree");
		return null;
	}

	@Override
	public R visitTypeCast(TypeCastTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl TypeCastTree");
		return null;
	}

	@Override
	public R visitTypeParameter(TypeParameterTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl TypeParameterTree");
		return null;
	}

	@Override
	public R visitUnary(UnaryTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl UnaryTree");
		return null;
	}

	@Override
	public R visitUnionType(UnionTypeTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl UnionTypeTree");
		return null;
	}

	@Override
	public R visitVariable(VariableTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl VariableTree");
		return null;
	}

	@Override
	public R visitWhileLoop(WhileLoopTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl WhileLoopTree");
		return null;
	}

	@Override
	public R visitWildcard(WildcardTree arg0, P arg1) {
		System.out.println(" ----Visited via Impl WildcardTree");
		return null;
	}

}
