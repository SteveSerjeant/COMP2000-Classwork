package com.mvc4.model;

import com.mvc4.KeyValuePair;
import com.mvc4.controller.AbstractController;

public interface IModelSubject {

    void add(AbstractController observer);
    void remove (AbstractController observer);
    void onPropertyChanged(KeyValuepair data);
}
