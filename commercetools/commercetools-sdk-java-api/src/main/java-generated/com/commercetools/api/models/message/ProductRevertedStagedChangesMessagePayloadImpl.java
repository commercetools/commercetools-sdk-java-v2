
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductRevertedStagedChangesMessagePayloadImpl
        implements ProductRevertedStagedChangesMessagePayload, ModelBase {

    private String type;

    private java.util.List<String> removedImageUrls;

    @JsonCreator
    ProductRevertedStagedChangesMessagePayloadImpl(
            @JsonProperty("removedImageUrls") final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
        this.type = PRODUCT_REVERTED_STAGED_CHANGES;
    }

    public ProductRevertedStagedChangesMessagePayloadImpl() {
        this.type = PRODUCT_REVERTED_STAGED_CHANGES;
    }

    public String getType() {
        return this.type;
    }

    public java.util.List<String> getRemovedImageUrls() {
        return this.removedImageUrls;
    }

    public void setRemovedImageUrls(final String... removedImageUrls) {
        this.removedImageUrls = new ArrayList<>(Arrays.asList(removedImageUrls));
    }

    public void setRemovedImageUrls(final java.util.List<String> removedImageUrls) {
        this.removedImageUrls = removedImageUrls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductRevertedStagedChangesMessagePayloadImpl that = (ProductRevertedStagedChangesMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type).append(removedImageUrls, that.removedImageUrls).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(removedImageUrls).toHashCode();
    }

}
