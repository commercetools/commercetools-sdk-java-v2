
package com.commercetools.api.models.product;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductRevertStagedChangesActionImpl;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductRevertStagedChangesActionImpl.class)
public interface ProductRevertStagedChangesAction extends ProductUpdateAction {

    public static ProductRevertStagedChangesAction of() {
        return new ProductRevertStagedChangesActionImpl();
    }

    public static ProductRevertStagedChangesAction of(final ProductRevertStagedChangesAction template) {
        ProductRevertStagedChangesActionImpl instance = new ProductRevertStagedChangesActionImpl();
        return instance;
    }

    public static ProductRevertStagedChangesActionBuilder builder() {
        return ProductRevertStagedChangesActionBuilder.of();
    }

    public static ProductRevertStagedChangesActionBuilder builder(final ProductRevertStagedChangesAction template) {
        return ProductRevertStagedChangesActionBuilder.of(template);
    }

    default <T> T withProductRevertStagedChangesAction(Function<ProductRevertStagedChangesAction, T> helper) {
        return helper.apply(this);
    }
}
