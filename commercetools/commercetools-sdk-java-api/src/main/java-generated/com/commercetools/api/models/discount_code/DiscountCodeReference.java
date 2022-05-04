
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:DiscountCode">DiscountCode</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeReferenceImpl.class)
public interface DiscountCodeReference extends Reference, com.commercetools.api.models.Identifiable<DiscountCode> {

    String DISCOUNT_CODE = "discount-code";

    /**
    *  <p>Contains the representation of the expanded DiscountCode. Only present in responses to requests with <a href="/../api/general-concepts#reference-expansion">Reference Expansion</a> for DiscountCodes.</p>
    */
    @Valid
    @JsonProperty("obj")
    public DiscountCode getObj();

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:DiscountCode">DiscountCode</a>.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final DiscountCode obj);

    public void setId(final String id);

    public static DiscountCodeReference of() {
        return new DiscountCodeReferenceImpl();
    }

    public static DiscountCodeReference of(final DiscountCodeReference template) {
        DiscountCodeReferenceImpl instance = new DiscountCodeReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static DiscountCodeReferenceBuilder builder() {
        return DiscountCodeReferenceBuilder.of();
    }

    public static DiscountCodeReferenceBuilder builder(final DiscountCodeReference template) {
        return DiscountCodeReferenceBuilder.of(template);
    }

    default <T> T withDiscountCodeReference(Function<DiscountCodeReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeReference>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeReference>";
            }
        };
    }
}
