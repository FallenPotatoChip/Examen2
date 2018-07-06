package pe.edu.pucp.examen2.Presenter;

import java.util.ArrayList;
import java.util.List;

import pe.edu.pucp.examen2.Model.User;
import pe.edu.pucp.examen2.Utilities.FirebaseManager;
import pe.edu.pucp.examen2.View.IPantalla3;

public class UserPresenter extends IUsersPresenter {
    private IPantalla3 mPantalla3View;
    private List<User> mUsers = new ArrayList<>();
    private String mUserId;

    public UserPresenter(IPantalla3 pantalla3View,String userId)
    {
        mPantalla3View = pantalla3View;
        mUserId = userId;
    }

    @Override
    public String getmUserId() {
        return mUserId;
    }

    @Override
    public void getUsers() {

        List<User> users= FirebaseManager.getInstance(mPantalla3View.getContext()).getUsers();

    }
}

