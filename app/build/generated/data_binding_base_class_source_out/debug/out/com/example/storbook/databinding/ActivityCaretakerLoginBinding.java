// Generated by view binder compiler. Do not edit!
package com.example.storbook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.storbook.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCaretakerLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText caretakerEmail;

  @NonNull
  public final EditText caretakerPassword;

  @NonNull
  public final Button loginButton;

  @NonNull
  public final ProgressBar progressBar2;

  @NonNull
  public final Button registerLink;

  private ActivityCaretakerLoginBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText caretakerEmail, @NonNull EditText caretakerPassword,
      @NonNull Button loginButton, @NonNull ProgressBar progressBar2,
      @NonNull Button registerLink) {
    this.rootView = rootView;
    this.caretakerEmail = caretakerEmail;
    this.caretakerPassword = caretakerPassword;
    this.loginButton = loginButton;
    this.progressBar2 = progressBar2;
    this.registerLink = registerLink;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCaretakerLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCaretakerLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_caretaker_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCaretakerLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.caretakerEmail;
      EditText caretakerEmail = ViewBindings.findChildViewById(rootView, id);
      if (caretakerEmail == null) {
        break missingId;
      }

      id = R.id.caretakerPassword;
      EditText caretakerPassword = ViewBindings.findChildViewById(rootView, id);
      if (caretakerPassword == null) {
        break missingId;
      }

      id = R.id.loginButton;
      Button loginButton = ViewBindings.findChildViewById(rootView, id);
      if (loginButton == null) {
        break missingId;
      }

      id = R.id.progressBar2;
      ProgressBar progressBar2 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar2 == null) {
        break missingId;
      }

      id = R.id.registerLink;
      Button registerLink = ViewBindings.findChildViewById(rootView, id);
      if (registerLink == null) {
        break missingId;
      }

      return new ActivityCaretakerLoginBinding((ConstraintLayout) rootView, caretakerEmail,
          caretakerPassword, loginButton, progressBar2, registerLink);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}