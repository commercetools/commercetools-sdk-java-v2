
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExtensionSetKeyActionImpl.class)
public interface ExtensionSetKeyAction extends ExtensionUpdateAction {

    String SET_KEY = "setKey";

    /**
    *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static ExtensionSetKeyAction of() {
        return new ExtensionSetKeyActionImpl();
    }

    public static ExtensionSetKeyAction of(final ExtensionSetKeyAction template) {
        ExtensionSetKeyActionImpl instance = new ExtensionSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ExtensionSetKeyActionBuilder builder() {
        return ExtensionSetKeyActionBuilder.of();
    }

    public static ExtensionSetKeyActionBuilder builder(final ExtensionSetKeyAction template) {
        return ExtensionSetKeyActionBuilder.of(template);
    }

    default <T> T withExtensionSetKeyAction(Function<ExtensionSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
