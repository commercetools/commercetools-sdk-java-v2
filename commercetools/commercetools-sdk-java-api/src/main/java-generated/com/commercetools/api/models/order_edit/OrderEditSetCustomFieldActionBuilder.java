
package com.commercetools.api.models.order_edit;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.order_edit.OrderEditSetCustomFieldAction;
import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditSetCustomFieldActionBuilder {

    private String name;

    @Nullable
    private com.fasterxml.jackson.databind.JsonNode value;

    public OrderEditSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public OrderEditSetCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
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

    public OrderEditSetCustomFieldAction build() {
        return new OrderEditSetCustomFieldActionImpl(name, value);
    }

    public static OrderEditSetCustomFieldActionBuilder of() {
        return new OrderEditSetCustomFieldActionBuilder();
    }

    public static OrderEditSetCustomFieldActionBuilder of(final OrderEditSetCustomFieldAction template) {
        OrderEditSetCustomFieldActionBuilder builder = new OrderEditSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
