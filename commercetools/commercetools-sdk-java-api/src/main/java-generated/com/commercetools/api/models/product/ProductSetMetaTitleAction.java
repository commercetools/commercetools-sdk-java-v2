
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductSetMetaTitleActionImpl.class)
public interface ProductSetMetaTitleAction extends ProductUpdateAction {

    String SET_META_TITLE = "setMetaTitle";

    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setMetaTitle(final LocalizedString metaTitle);

    public void setStaged(final Boolean staged);

    public static ProductSetMetaTitleAction of() {
        return new ProductSetMetaTitleActionImpl();
    }

    public static ProductSetMetaTitleAction of(final ProductSetMetaTitleAction template) {
        ProductSetMetaTitleActionImpl instance = new ProductSetMetaTitleActionImpl();
        instance.setMetaTitle(template.getMetaTitle());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetMetaTitleActionBuilder builder() {
        return ProductSetMetaTitleActionBuilder.of();
    }

    public static ProductSetMetaTitleActionBuilder builder(final ProductSetMetaTitleAction template) {
        return ProductSetMetaTitleActionBuilder.of(template);
    }

    default <T> T withProductSetMetaTitleAction(Function<ProductSetMetaTitleAction, T> helper) {
        return helper.apply(this);
    }
}
