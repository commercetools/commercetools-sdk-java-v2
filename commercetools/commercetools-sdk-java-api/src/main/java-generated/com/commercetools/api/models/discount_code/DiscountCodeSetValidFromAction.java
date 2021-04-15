
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetValidFromActionImpl.class)
public interface DiscountCodeSetValidFromAction extends DiscountCodeUpdateAction {

    String SET_VALID_FROM = "setValidFrom";

    /**
    *  <p>If absent, the field with the value is removed in case a value was set before.</p>
    */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    public void setValidFrom(final ZonedDateTime validFrom);

    public static DiscountCodeSetValidFromAction of() {
        return new DiscountCodeSetValidFromActionImpl();
    }

    public static DiscountCodeSetValidFromAction of(final DiscountCodeSetValidFromAction template) {
        DiscountCodeSetValidFromActionImpl instance = new DiscountCodeSetValidFromActionImpl();
        instance.setValidFrom(template.getValidFrom());
        return instance;
    }

    public static DiscountCodeSetValidFromActionBuilder builder() {
        return DiscountCodeSetValidFromActionBuilder.of();
    }

    public static DiscountCodeSetValidFromActionBuilder builder(final DiscountCodeSetValidFromAction template) {
        return DiscountCodeSetValidFromActionBuilder.of(template);
    }

    default <T> T withDiscountCodeSetValidFromAction(Function<DiscountCodeSetValidFromAction, T> helper) {
        return helper.apply(this);
    }
}
