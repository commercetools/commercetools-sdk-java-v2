
package com.commercetools.api.models.category;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.category.CategoryChangeOrderHintAction;
import com.commercetools.api.models.category.CategoryUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryChangeOrderHintActionBuilder {

    private String orderHint;

    public CategoryChangeOrderHintActionBuilder orderHint(final String orderHint) {
        this.orderHint = orderHint;
        return this;
    }

    public String getOrderHint() {
        return this.orderHint;
    }

    public CategoryChangeOrderHintAction build() {
        return new CategoryChangeOrderHintActionImpl(orderHint);
    }

    public static CategoryChangeOrderHintActionBuilder of() {
        return new CategoryChangeOrderHintActionBuilder();
    }

    public static CategoryChangeOrderHintActionBuilder of(final CategoryChangeOrderHintAction template) {
        CategoryChangeOrderHintActionBuilder builder = new CategoryChangeOrderHintActionBuilder();
        builder.orderHint = template.getOrderHint();
        return builder;
    }

}
