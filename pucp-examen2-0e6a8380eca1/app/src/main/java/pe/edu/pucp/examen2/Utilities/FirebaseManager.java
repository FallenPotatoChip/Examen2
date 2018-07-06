package pe.edu.pucp.examen2.Utilities;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import pe.edu.pucp.examen2.Model.User;

public class FirebaseManager {
    public static final String USER_REFERENCE = "users";

    private static FirebaseManager instance = new FirebaseManager();
    private Context mContext;
    private DatabaseReference mDatabaeReference;
    private FirebaseManager(){}

    public static FirebaseManager getInstance(Context context) {
        if(instance.mContext == null) {
            instance.mContext = context;
        }
        return instance;
    }

    public void CreateUser(final User user) {
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        ref.child(USER_REFERENCE).child(user.getId()).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if(!dataSnapshot.exists()){
                    mDatabaeReference = FirebaseDatabase.getInstance().getReference(USER_REFERENCE);
                    mDatabaeReference.child(user.getId()).setValue(user);
                }else
                {
                    User newUser = dataSnapshot.getValue(User.class);
                    user.setmLongitude(newUser.getmLongitude());
                    user.setmLatitude(newUser.getmLatitude());
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public List<User> getUsers(final User currentUser)
    {
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        ref.child(USER_REFERENCE).addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                try{
                    List<User> users = new ArrayList<>();
                    for(DataSnapshot snapUser : dataSnapshot.getChildren()){
                        String key = snapUser.getKey();
                        User user = snapUser.getValue(User.class);
                        users.add(user);
                    }
                    return users;
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }


}
