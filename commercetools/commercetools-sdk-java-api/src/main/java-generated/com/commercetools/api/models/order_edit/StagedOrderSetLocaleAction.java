
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetLocaleActionImpl.class)
public interface StagedOrderSetLocaleAction extends StagedOrderUpdateAction {

    String SET_LOCALE = "setLocale";

    @JsonProperty("locale")
    public String getLocale();

    public void setLocale(final String locale);

    public static StagedOrderSetLocaleAction of() {
        return new StagedOrderSetLocaleActionImpl();
    }

    public static StagedOrderSetLocaleAction of(final StagedOrderSetLocaleAction template) {
        StagedOrderSetLocaleActionImpl instance = new StagedOrderSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public static StagedOrderSetLocaleActionBuilder builder() {
        return StagedOrderSetLocaleActionBuilder.of();
    }

    public static StagedOrderSetLocaleActionBuilder builder(final StagedOrderSetLocaleAction template) {
        return StagedOrderSetLocaleActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetLocaleAction(Function<StagedOrderSetLocaleAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLocaleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetLocaleAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetLocaleAction>";
            }
        };
    }
}
