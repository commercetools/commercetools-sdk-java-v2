
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class KeyReferenceBuilder implements Builder<KeyReference> {

    private String key;

    private com.commercetools.history.models.common.ReferenceTypeId typeId;

    public KeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public KeyReferenceBuilder typeId(final com.commercetools.history.models.common.ReferenceTypeId typeId) {
        this.typeId = typeId;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public com.commercetools.history.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    public KeyReference build() {
        Objects.requireNonNull(key, KeyReference.class + ": key is missing");
        Objects.requireNonNull(typeId, KeyReference.class + ": typeId is missing");
        return new KeyReferenceImpl(key, typeId);
    }

    /**
     * builds KeyReference without checking for non null required values
     */
    public KeyReference buildUnchecked() {
        return new KeyReferenceImpl(key, typeId);
    }

    public static KeyReferenceBuilder of() {
        return new KeyReferenceBuilder();
    }

    public static KeyReferenceBuilder of(final KeyReference template) {
        KeyReferenceBuilder builder = new KeyReferenceBuilder();
        builder.key = template.getKey();
        builder.typeId = template.getTypeId();
        return builder;
    }

}
