package com.project.csci3130.dalrs;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class setupDatabase {
    FirebaseDatabase database= FirebaseDatabase.getInstance();
    DatabaseReference DBref=database.getReference("message");

    DBref.setValue("Hello, World!");
}
