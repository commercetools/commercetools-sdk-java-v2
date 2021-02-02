
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TermFacetResultBuilder {

    private com.commercetools.api.models.product.TermFacetResultType dataType;

    private Long missing;

    private Long total;

    private Long other;

    private java.util.List<com.commercetools.api.models.product.FacetResultTerm> terms;

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

    public TermFacetResultBuilder terms(final com.commercetools.api.models.product.FacetResultTerm... terms) {
        this.terms = new ArrayList<>(Arrays.asList(terms));
        return this;
    }

    public TermFacetResultBuilder terms(
            final java.util.List<com.commercetools.api.models.product.FacetResultTerm> terms) {
        this.terms = terms;
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

    public java.util.List<com.commercetools.api.models.product.FacetResultTerm> getTerms() {
        return this.terms;
    }

    public TermFacetResult build() {
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
