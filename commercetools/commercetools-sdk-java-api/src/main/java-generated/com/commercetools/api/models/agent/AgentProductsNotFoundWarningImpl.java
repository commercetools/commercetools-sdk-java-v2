
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when one or more Products referenced in an Intake Agent <span>API request</span> could not be matched to the catalog. The unmatched Products are omitted from the created entity.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentProductsNotFoundWarningImpl implements AgentProductsNotFoundWarning, ModelBase {

    private String code;

    private String message;

    private java.util.List<String> products;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AgentProductsNotFoundWarningImpl(@JsonProperty("message") final String message,
            @JsonProperty("products") final java.util.List<String> products) {
        this.message = message;
        this.products = products;
        this.code = PRODUCTS_NOT_FOUND;
    }

    /**
     * create empty instance
     */
    public AgentProductsNotFoundWarningImpl() {
        this.code = PRODUCTS_NOT_FOUND;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Plain text description of the unmatched Products.</p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Identifiers of the Products that could not be matched to the catalog, as they appeared in the input.</p>
     */

    public java.util.List<String> getProducts() {
        return this.products;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setProducts(final String... products) {
        this.products = new ArrayList<>(Arrays.asList(products));
    }

    public void setProducts(final java.util.List<String> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AgentProductsNotFoundWarningImpl that = (AgentProductsNotFoundWarningImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(products, that.products)
                .append(code, that.code)
                .append(message, that.message)
                .append(products, that.products)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(products).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("products", products)
                .build();
    }

    @Override
    public AgentProductsNotFoundWarning copyDeep() {
        return AgentProductsNotFoundWarning.deepCopy(this);
    }
}
