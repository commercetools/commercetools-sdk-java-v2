
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a discount code by its key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeKeyReferenceImpl.class)
public interface DiscountCodeKeyReference extends KeyReference {

    String DISCOUNT_CODE = "discount-code";

    public static DiscountCodeKeyReference of() {
        return new DiscountCodeKeyReferenceImpl();
    }

    public static DiscountCodeKeyReference of(final DiscountCodeKeyReference template) {
        DiscountCodeKeyReferenceImpl instance = new DiscountCodeKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static DiscountCodeKeyReferenceBuilder builder() {
        return DiscountCodeKeyReferenceBuilder.of();
    }

    public static DiscountCodeKeyReferenceBuilder builder(final DiscountCodeKeyReference template) {
        return DiscountCodeKeyReferenceBuilder.of(template);
    }

    default <T> T withDiscountCodeKeyReference(Function<DiscountCodeKeyReference, T> helper) {
        return helper.apply(this);
    }
}
