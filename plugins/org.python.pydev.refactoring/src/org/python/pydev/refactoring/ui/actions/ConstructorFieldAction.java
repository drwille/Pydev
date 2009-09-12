/* 
 * Copyright (C) 2006, 2007  Dennis Hunziker, Ueli Kistler
 * Copyright (C) 2007  Reto Schuettel, Robin Stocker
 *
 * IFS Institute for Software, HSR Rapperswil, Switzerland
 * 
 */

package org.python.pydev.refactoring.ui.actions;

import org.eclipse.jface.wizard.IWizardPage;
import org.python.pydev.refactoring.codegenerator.constructorfield.ConstructorFieldRefactoring;
import org.python.pydev.refactoring.core.base.AbstractPythonRefactoring;
import org.python.pydev.refactoring.core.base.RefactoringInfo;
import org.python.pydev.refactoring.core.model.constructorfield.ClassFieldTreeProvider;
import org.python.pydev.refactoring.ui.actions.internal.AbstractRefactoringAction;
import org.python.pydev.refactoring.ui.pages.ConstructorFieldPage;

public class ConstructorFieldAction extends AbstractRefactoringAction {
    @Override
    protected AbstractPythonRefactoring createRefactoring(RefactoringInfo info) {
        return new ConstructorFieldRefactoring(info);
    }

    @Override
    protected IWizardPage createPage(RefactoringInfo info) {
        ClassFieldTreeProvider provider = new ClassFieldTreeProvider(info.getScopeClass());
        return new ConstructorFieldPage(provider);
    }
}
