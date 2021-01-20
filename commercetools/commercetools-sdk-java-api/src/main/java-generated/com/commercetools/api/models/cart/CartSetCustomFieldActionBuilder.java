
package com.commercetools.api.models.cart;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.CartSetCustomFieldAction;
import com.commercetools.api.models.cart.CartUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetCustomFieldActionBuilder {

    private String name;

    @Nullable
    private com.fasterxml.jackson.databind.JsonNode value;

    public CartSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CartSetCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getValue() {
        return this.value;
    }

    public CartSetCustomFieldAction build() {
        return new CartSetCustomFieldActionImpl(name, value);
    }

    public static CartSetCustomFieldActionBuilder of() {
        return new CartSetCustomFieldActionBuilder();
    }

    public static CartSetCustomFieldActionBuilder of(final CartSetCustomFieldAction template) {
        CartSetCustomFieldActionBuilder builder = new CartSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
