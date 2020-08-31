package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.orders.OrderImport;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
*  <p>An import request for multiple order import resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderImportRequestImpl implements OrderImportRequest {

    private com.commercetools.importapi.models.common.ImportResourceType type;
    
    private java.util.List<com.commercetools.importapi.models.orders.OrderImport> resources;

    @JsonCreator
    OrderImportRequestImpl(@JsonProperty("resources") final java.util.List<com.commercetools.importapi.models.orders.OrderImport> resources) {
        this.resources = resources;
        this.type = ImportResourceType.findEnumViaJsonName("order").get();
    }
    public OrderImportRequestImpl() {
       
    }

    /**
    *  <p>The type of the import resource.</p>
    */
    public com.commercetools.importapi.models.common.ImportResourceType getType(){
        return this.type;
    }
    
    /**
    *  <p>The order import resources of this request.</p>
    */
    public java.util.List<com.commercetools.importapi.models.orders.OrderImport> getResources(){
        return this.resources;
    }

    public void setResources(final java.util.List<com.commercetools.importapi.models.orders.OrderImport> resources){
        this.resources = resources;
    }

}
