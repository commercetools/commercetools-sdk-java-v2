
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetValidUntilActionImpl.class)
public interface DiscountCodeSetValidUntilAction extends DiscountCodeUpdateAction {

    String SET_VALID_UNTIL = "setValidUntil";

    /**
    *  <p>If absent, the field with the value is removed in case a value was set before.</p>
    */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    public void setValidUntil(final ZonedDateTime validUntil);

    public static DiscountCodeSetValidUntilAction of() {
        return new DiscountCodeSetValidUntilActionImpl();
    }

    public static DiscountCodeSetValidUntilAction of(final DiscountCodeSetValidUntilAction template) {
        DiscountCodeSetValidUntilActionImpl instance = new DiscountCodeSetValidUntilActionImpl();
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public static DiscountCodeSetValidUntilActionBuilder builder() {
        return DiscountCodeSetValidUntilActionBuilder.of();
    }

    public static DiscountCodeSetValidUntilActionBuilder builder(final DiscountCodeSetValidUntilAction template) {
        return DiscountCodeSetValidUntilActionBuilder.of(template);
    }

    default <T> T withDiscountCodeSetValidUntilAction(Function<DiscountCodeSetValidUntilAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetValidUntilAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetValidUntilAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetValidUntilAction>";
            }
        };
    }
}
