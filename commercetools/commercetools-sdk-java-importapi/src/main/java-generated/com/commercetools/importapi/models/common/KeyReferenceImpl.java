
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.CartDiscountKeyReference;
import com.commercetools.importapi.models.common.CategoryKeyReference;
import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.CustomerKeyReference;
import com.commercetools.importapi.models.common.PriceKeyReference;
import com.commercetools.importapi.models.common.ProductDiscountKeyReference;
import com.commercetools.importapi.models.common.ProductKeyReference;
import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import com.commercetools.importapi.models.common.ProductVariantKeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.ShippingMethodKeyReference;
import com.commercetools.importapi.models.common.StateKeyReference;
import com.commercetools.importapi.models.common.StoreKeyReference;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import com.commercetools.importapi.models.common.TypeKeyReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>References a resource by its key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class KeyReferenceImpl implements KeyReference {

    private String key;

    private com.commercetools.importapi.models.common.ReferenceType typeId;

    @JsonCreator
    KeyReferenceImpl(@JsonProperty("key") final String key,
            @JsonProperty("typeId") final com.commercetools.importapi.models.common.ReferenceType typeId) {
        this.key = key;
        this.typeId = typeId;
    }

    public KeyReferenceImpl() {
    }

    public String getKey() {
        return this.key;
    }

    /**
    *  <p>The type of the referenced resource.</p>
    */
    public com.commercetools.importapi.models.common.ReferenceType getTypeId() {
        return this.typeId;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        KeyReferenceImpl that = (KeyReferenceImpl) o;

        return new EqualsBuilder().append(key, that.key).append(typeId, that.typeId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key).append(typeId).toHashCode();
    }

}
