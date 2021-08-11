
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartRecalculateActionBuilder implements Builder<MyCartRecalculateAction> {

    @Nullable
    private Boolean updateProductData;

    public MyCartRecalculateActionBuilder updateProductData(@Nullable final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        return this;
    }

    @Nullable
    public Boolean getUpdateProductData() {
        return this.updateProductData;
    }

    public MyCartRecalculateAction build() {
        return new MyCartRecalculateActionImpl(updateProductData);
    }

    /**
     * builds MyCartRecalculateAction without checking for non null required values
     */
    public MyCartRecalculateAction buildUnchecked() {
        return new MyCartRecalculateActionImpl(updateProductData);
    }

    public static MyCartRecalculateActionBuilder of() {
        return new MyCartRecalculateActionBuilder();
    }

    public static MyCartRecalculateActionBuilder of(final MyCartRecalculateAction template) {
        MyCartRecalculateActionBuilder builder = new MyCartRecalculateActionBuilder();
        builder.updateProductData = template.getUpdateProductData();
        return builder;
    }

}
