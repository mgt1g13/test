/*
 * Copyright (c) 2010 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package ac.soton.eventb.statemachines.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;

import ac.soton.eventb.statemachines.diagram.edit.policies.StateStatemachinesCompartmentCanonicalEditPolicy;
import ac.soton.eventb.statemachines.diagram.edit.policies.StateStatemachinesCompartmentItemSemanticEditPolicy;
import ac.soton.eventb.statemachines.diagram.edit.policies.custom.TransitionReorientOnCollapsedCompartmentEditPolicy;
import ac.soton.eventb.statemachines.diagram.part.Messages;

/**
 * @generated
 */
public class StateStatemachinesCompartmentEditPart extends
		ListCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 7001;

	/**
	 * @generated
	 */
	public StateStatemachinesCompartmentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected boolean hasModelChildrenChanged(Notification evt) {
		return false;
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.StateStatemachinesCompartmentEditPart_title;
	}

	/**
	 * @generated NOT
	 */
	public IFigure createFigure() {
		ResizableCompartmentFigure result = (ResizableCompartmentFigure) super
				.createFigure();
		result.setTitleVisibility(false);
		// add margins
		Insets insets = result.getContentPane().getInsets();
		insets.top = -1;
		insets.bottom = 1;
		insets.left = 1;
		insets.right = 1;
		// use all space
		ConstrainedToolbarLayout layoutMgr = (ConstrainedToolbarLayout) result
				.getContentPane().getLayoutManager();
		layoutMgr.setVertical(true);
		layoutMgr.setStretchMajorAxis(true);
		layoutMgr.setStretchMinorAxis(true);
		layoutMgr.setSpacing(0);

		return result;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new StateStatemachinesCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new StateStatemachinesCompartmentCanonicalEditPolicy());
		installEditPolicy(
				TransitionReorientOnCollapsedCompartmentEditPolicy.TROCC_ROLE,
				new TransitionReorientOnCollapsedCompartmentEditPolicy());
	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}

}
