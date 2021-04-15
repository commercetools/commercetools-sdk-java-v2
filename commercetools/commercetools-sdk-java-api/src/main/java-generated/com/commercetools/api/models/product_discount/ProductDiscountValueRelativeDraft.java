
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountValueRelativeDraftImpl.class)
public interface ProductDiscountValueRelativeDraft extends ProductDiscountValueDraft {

    String RELATIVE = "relative";

    @NotNull
    @JsonProperty("permyriad")
    public Long getPermyriad();

    public void setPermyriad(final Long permyriad);

    public static ProductDiscountValueRelativeDraft of() {
        return new ProductDiscountValueRelativeDraftImpl();
    }

    public static ProductDiscountValueRelativeDraft of(final ProductDiscountValueRelativeDraft template) {
        ProductDiscountValueRelativeDraftImpl instance = new ProductDiscountValueRelativeDraftImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    public static ProductDiscountValueRelativeDraftBuilder builder() {
        return ProductDiscountValueRelativeDraftBuilder.of();
    }

    public static ProductDiscountValueRelativeDraftBuilder builder(final ProductDiscountValueRelativeDraft template) {
        return ProductDiscountValueRelativeDraftBuilder.of(template);
    }

    default <T> T withProductDiscountValueRelativeDraft(Function<ProductDiscountValueRelativeDraft, T> helper) {
        return helper.apply(this);
    }
}
