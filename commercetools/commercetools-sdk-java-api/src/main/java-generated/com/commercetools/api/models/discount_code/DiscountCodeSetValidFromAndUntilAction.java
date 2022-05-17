
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetValidFromAndUntilActionImpl.class)
public interface DiscountCodeSetValidFromAndUntilAction extends DiscountCodeUpdateAction {

    String SET_VALID_FROM_AND_UNTIL = "setValidFromAndUntil";

    /**
    *  <p>Value to set that must be earlier than <code>validUntil</code>. If empty, any existing value will be removed.</p>
    */

    @JsonProperty("validFrom")
    public ZonedDateTime getValidFrom();

    /**
    *  <p>Value to set that must be later than <code>validFrom</code>. If empty, any existing value will be removed.</p>
    */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    public void setValidFrom(final ZonedDateTime validFrom);

    public void setValidUntil(final ZonedDateTime validUntil);

    public static DiscountCodeSetValidFromAndUntilAction of() {
        return new DiscountCodeSetValidFromAndUntilActionImpl();
    }

    public static DiscountCodeSetValidFromAndUntilAction of(final DiscountCodeSetValidFromAndUntilAction template) {
        DiscountCodeSetValidFromAndUntilActionImpl instance = new DiscountCodeSetValidFromAndUntilActionImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public static DiscountCodeSetValidFromAndUntilActionBuilder builder() {
        return DiscountCodeSetValidFromAndUntilActionBuilder.of();
    }

    public static DiscountCodeSetValidFromAndUntilActionBuilder builder(
            final DiscountCodeSetValidFromAndUntilAction template) {
        return DiscountCodeSetValidFromAndUntilActionBuilder.of(template);
    }

    default <T> T withDiscountCodeSetValidFromAndUntilAction(
            Function<DiscountCodeSetValidFromAndUntilAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetValidFromAndUntilAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetValidFromAndUntilAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetValidFromAndUntilAction>";
            }
        };
    }
}
