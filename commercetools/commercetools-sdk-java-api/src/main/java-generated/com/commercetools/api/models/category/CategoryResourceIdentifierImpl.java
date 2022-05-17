
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p><a href="ctp:api:type:ResourceIdentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Category">Category</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CategoryResourceIdentifierImpl implements CategoryResourceIdentifier, ModelBase {

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    private String id;

    private String key;

    @JsonCreator
    CategoryResourceIdentifierImpl(@JsonProperty("id") final String id, @JsonProperty("key") final String key) {
        this.id = id;
        this.key = key;
        this.typeId = ReferenceTypeId.findEnum("category");
    }

    public CategoryResourceIdentifierImpl() {
        this.typeId = ReferenceTypeId.findEnum("category");
    }

    /**
    *  <p>Type of referenced resource. If given, it must match the expected <a href="ctp:api:type:ReferenceTypeId">ReferenceTypeId</a> of the referenced resource.</p>
    */
    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:Channel">Category</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */
    public String getId() {
        return this.id;
    }

    /**
    *  <p>User-defined unique identifier of the referenced <a href="ctp:api:type:Category">Category</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */
    public String getKey() {
        return this.key;
    }

    public void setId(final String id) {
        this.id = id;
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

        CategoryResourceIdentifierImpl that = (CategoryResourceIdentifierImpl) o;

        return new EqualsBuilder().append(typeId, that.typeId).append(id, that.id).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(typeId).append(id).append(key).toHashCode();
    }

}
