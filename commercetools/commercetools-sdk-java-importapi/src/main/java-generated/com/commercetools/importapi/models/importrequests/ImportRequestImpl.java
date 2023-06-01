package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.CategoryImportRequest;
import com.commercetools.importapi.models.importrequests.CustomerImportRequest;
import com.commercetools.importapi.models.importrequests.InventoryImportRequest;
import com.commercetools.importapi.models.importrequests.OrderImportRequest;
import com.commercetools.importapi.models.importrequests.OrderPatchImportRequest;
import com.commercetools.importapi.models.importrequests.PriceImportRequest;
import com.commercetools.importapi.models.importrequests.ProductDraftImportRequest;
import com.commercetools.importapi.models.importrequests.ProductImportRequest;
import com.commercetools.importapi.models.importrequests.ProductTypeImportRequest;
import com.commercetools.importapi.models.importrequests.ProductVariantImportRequest;
import com.commercetools.importapi.models.importrequests.ProductVariantPatchRequest;
import com.commercetools.importapi.models.importrequests.StandalonePriceImportRequest;
import com.commercetools.importapi.models.importrequests.TypeImportRequest;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>An import request batches multiple import resources of the same import resource type for processing by an import container.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ImportRequestImpl implements ImportRequest, ModelBase {

    
    private com.commercetools.importapi.models.common.ImportResourceType type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ImportRequestImpl(@JsonProperty("type") final com.commercetools.importapi.models.common.ImportResourceType type) {
        this.type = type;
    }
    /**
     * create empty instance
     */
    public ImportRequestImpl() {
    }

    /**
     *  <p>The resource types that can be imported.</p>
     */
    
    public com.commercetools.importapi.models.common.ImportResourceType getType(){
        return this.type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ImportRequestImpl that = (ImportRequestImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .toHashCode();
    }

}
