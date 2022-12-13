// Generated by data binding compiler. Do not edit!
package com.asuni.assignment.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.asuni.assignment.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class HomeBinding extends ViewDataBinding {
  @NonNull
  public final TextView headerTitle;

  @NonNull
  public final View listLayout;

  @NonNull
  public final View loader;

  @NonNull
  public final LinearLayout mapToolBar1;

  @NonNull
  public final ImageButton menuBtn;

  @NonNull
  public final View messageLayout;

  @NonNull
  public final ImageButton sortListBTN;

  @NonNull
  public final Toolbar toolbar;

  protected HomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView headerTitle, View listLayout, View loader, LinearLayout mapToolBar1,
      ImageButton menuBtn, View messageLayout, ImageButton sortListBTN, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.headerTitle = headerTitle;
    this.listLayout = listLayout;
    this.loader = loader;
    this.mapToolBar1 = mapToolBar1;
    this.menuBtn = menuBtn;
    this.messageLayout = messageLayout;
    this.sortListBTN = sortListBTN;
    this.toolbar = toolbar;
  }

  @NonNull
  public static HomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HomeBinding>inflateInternal(inflater, R.layout.home, root, attachToRoot, component);
  }

  @NonNull
  public static HomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<HomeBinding>inflateInternal(inflater, R.layout.home, null, false, component);
  }

  public static HomeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static HomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (HomeBinding)bind(component, view, R.layout.home);
  }
}
