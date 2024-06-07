
package com.commercetools.api.models;

public class SimpleIdentifiable<T> implements Identifiable<T> {

    private final String id;

    public SimpleIdentifiable(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

}
