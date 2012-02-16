package com.jetbrains.python.packaging.setupPy;

import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yole
 */
public class PyPackagingGroup extends ActionGroup {
  @NotNull
  @Override
  public AnAction[] getChildren(@Nullable AnActionEvent e) {
    List<AnAction> result = new ArrayList<AnAction>();
    result.add(new CreateSetupPyAction());
    result.add(new SetupTaskChooserAction());
    //if (e != null) {
    //  final Module module = e.getData(LangDataKeys.MODULE);
    //  if (module != null) {
    //    final PyFile setupPy = PyPackageUtil.findSetupPy(module);
    //    if (setupPy != null) {
    //      result.add(Separator.getInstance());
    //      result.addAll(SetupTaskIntrospector.createSetupTaskActions(module, setupPy));
    //    }
    //  }
    //}
    return result.toArray(new AnAction[result.size()]);
  }
}
