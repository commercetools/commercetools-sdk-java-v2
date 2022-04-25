
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyShoppingListUpdateImpl.class)
public interface MyShoppingListUpdate extends
        com.commercetools.api.models.ResourceUpdate<MyShoppingListUpdate, MyShoppingListUpdateAction, MyShoppingListUpdateBuilder> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyShoppingListUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final MyShoppingListUpdateAction... actions);

    public void setActions(final List<MyShoppingListUpdateAction> actions);

    public static MyShoppingListUpdate of() {
        return new MyShoppingListUpdateImpl();
    }

    public static MyShoppingListUpdate of(final MyShoppingListUpdate template) {
        MyShoppingListUpdateImpl instance = new MyShoppingListUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static MyShoppingListUpdateBuilder builder() {
        return MyShoppingListUpdateBuilder.of();
    }

    public static MyShoppingListUpdateBuilder builder(final MyShoppingListUpdate template) {
        return MyShoppingListUpdateBuilder.of(template);
    }

    default <T> T withMyShoppingListUpdate(Function<MyShoppingListUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListUpdate>";
            }
        };
    }
}
