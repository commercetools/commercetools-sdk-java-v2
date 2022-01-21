
package com.commercetools.history.models.label;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomObjectLabelBuilder implements Builder<CustomObjectLabel> {

    private String key;

    private String container;

    public CustomObjectLabelBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public CustomObjectLabelBuilder container(final String container) {
        this.container = container;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public String getContainer() {
        return this.container;
    }

    public CustomObjectLabel build() {
        Objects.requireNonNull(key, CustomObjectLabel.class + ": key is missing");
        Objects.requireNonNull(container, CustomObjectLabel.class + ": container is missing");
        return new CustomObjectLabelImpl(key, container);
    }

    /**
     * builds CustomObjectLabel without checking for non null required values
     */
    public CustomObjectLabel buildUnchecked() {
        return new CustomObjectLabelImpl(key, container);
    }

    public static CustomObjectLabelBuilder of() {
        return new CustomObjectLabelBuilder();
    }

    public static CustomObjectLabelBuilder of(final CustomObjectLabel template) {
        CustomObjectLabelBuilder builder = new CustomObjectLabelBuilder();
        builder.key = template.getKey();
        builder.container = template.getContainer();
        return builder;
    }

}
