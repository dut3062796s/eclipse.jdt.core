/*******************************************************************************
 * Copyright (c) 2005 BEA Systems, Inc. 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    mkaufman@bea.com - initial API and implementation
 *    
 *******************************************************************************/

package org.eclipse.jdt.core.compiler;

/**
 * An result class used as a return value from ICompilationParticipant's notify() method 
 * when responding to a post-reconcile event.
 * 
 * @see ICompilationParticipant#notify(CompilationParticipantEvent)
 * @since 3.2
 */
public class PostReconcileCompilationResult extends CompilationParticipantResult {

	/**
	 * @return an integer flag indicating that this is result for a post-reconcile event.
	 * @see ICompilationParticipant#POST_RECONCILE_EVENT
	 * @see CompilationParticipantEvent#getKind()
	 */
	public final int getKind() { return ICompilationParticipant.POST_RECONCILE_EVENT; }

}
