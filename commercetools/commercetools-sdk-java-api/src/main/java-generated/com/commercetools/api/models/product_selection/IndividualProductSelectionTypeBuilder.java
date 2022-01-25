
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class IndividualProductSelectionTypeBuilder implements Builder<IndividualProductSelectionType> {

    private com.commercetools.api.models.common.LocalizedString name;

    public IndividualProductSelectionTypeBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public IndividualProductSelectionTypeBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public IndividualProductSelectionType build() {
        Objects.requireNonNull(name, IndividualProductSelectionType.class + ": name is missing");
        return new IndividualProductSelectionTypeImpl(name);
    }

    /**
     * builds IndividualProductSelectionType without checking for non null required values
     */
    public IndividualProductSelectionType buildUnchecked() {
        return new IndividualProductSelectionTypeImpl(name);
    }

    public static IndividualProductSelectionTypeBuilder of() {
        return new IndividualProductSelectionTypeBuilder();
    }

    public static IndividualProductSelectionTypeBuilder of(final IndividualProductSelectionType template) {
        IndividualProductSelectionTypeBuilder builder = new IndividualProductSelectionTypeBuilder();
        builder.name = template.getName();
        return builder;
    }

}
