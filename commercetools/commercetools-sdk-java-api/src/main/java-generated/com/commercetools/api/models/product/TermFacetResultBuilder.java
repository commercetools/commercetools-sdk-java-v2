
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class TermFacetResultBuilder implements Builder<TermFacetResult> {

    private com.commercetools.api.models.product.TermFacetResultType dataType;

    private Long missing;

    private Long total;

    private Long other;

    private java.util.List<com.commercetools.api.models.product.FacetTerm> terms;

    public TermFacetResultBuilder dataType(final com.commercetools.api.models.product.TermFacetResultType dataType) {
        this.dataType = dataType;
        return this;
    }

    public TermFacetResultBuilder missing(final Long missing) {
        this.missing = missing;
        return this;
    }

    public TermFacetResultBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public TermFacetResultBuilder other(final Long other) {
        this.other = other;
        return this;
    }

    public TermFacetResultBuilder terms(final com.commercetools.api.models.product.FacetTerm... terms) {
        this.terms = new ArrayList<>(Arrays.asList(terms));
        return this;
    }

    public TermFacetResultBuilder terms(final java.util.List<com.commercetools.api.models.product.FacetTerm> terms) {
        this.terms = terms;
        return this;
    }

    public TermFacetResultBuilder plusTerms(final com.commercetools.api.models.product.FacetTerm... terms) {
        if (this.terms == null) {
            this.terms = new ArrayList<>();
        }
        this.terms.addAll(Arrays.asList(terms));
        return this;
    }

    public TermFacetResultBuilder plusTerms(
            Function<com.commercetools.api.models.product.FacetTermBuilder, com.commercetools.api.models.product.FacetTermBuilder> builder) {
        if (this.terms == null) {
            this.terms = new ArrayList<>();
        }
        this.terms.add(builder.apply(com.commercetools.api.models.product.FacetTermBuilder.of()).build());
        return this;
    }

    public TermFacetResultBuilder withTerms(
            Function<com.commercetools.api.models.product.FacetTermBuilder, com.commercetools.api.models.product.FacetTermBuilder> builder) {
        this.terms = new ArrayList<>();
        this.terms.add(builder.apply(com.commercetools.api.models.product.FacetTermBuilder.of()).build());
        return this;
    }

    public com.commercetools.api.models.product.TermFacetResultType getDataType() {
        return this.dataType;
    }

    public Long getMissing() {
        return this.missing;
    }

    public Long getTotal() {
        return this.total;
    }

    public Long getOther() {
        return this.other;
    }

    public java.util.List<com.commercetools.api.models.product.FacetTerm> getTerms() {
        return this.terms;
    }

    public TermFacetResult build() {
        Objects.requireNonNull(dataType, TermFacetResult.class + ": dataType is missing");
        Objects.requireNonNull(missing, TermFacetResult.class + ": missing is missing");
        Objects.requireNonNull(total, TermFacetResult.class + ": total is missing");
        Objects.requireNonNull(other, TermFacetResult.class + ": other is missing");
        Objects.requireNonNull(terms, TermFacetResult.class + ": terms is missing");
        return new TermFacetResultImpl(dataType, missing, total, other, terms);
    }

    /**
     * builds TermFacetResult without checking for non null required values
     */
    public TermFacetResult buildUnchecked() {
        return new TermFacetResultImpl(dataType, missing, total, other, terms);
    }

    public static TermFacetResultBuilder of() {
        return new TermFacetResultBuilder();
    }

    public static TermFacetResultBuilder of(final TermFacetResult template) {
        TermFacetResultBuilder builder = new TermFacetResultBuilder();
        builder.dataType = template.getDataType();
        builder.missing = template.getMissing();
        builder.total = template.getTotal();
        builder.other = template.getOther();
        builder.terms = template.getTerms();
        return builder;
    }

}
