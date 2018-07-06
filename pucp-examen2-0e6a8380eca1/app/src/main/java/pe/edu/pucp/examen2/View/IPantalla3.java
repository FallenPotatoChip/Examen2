package pe.edu.pucp.examen2.View;

import android.content.Context;

import pe.edu.pucp.examen2.Model.User;

public interface IPantalla3 {
    void onUsersLoaded();
    void onUserLoaded(User user);
    void onUsersFinished();
    Context getContext();
}
