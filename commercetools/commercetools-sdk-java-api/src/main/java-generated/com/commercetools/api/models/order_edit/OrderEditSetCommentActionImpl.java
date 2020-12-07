package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditSetCommentActionImpl implements OrderEditSetCommentAction {

    private String action;
    
    private String comment;

    @JsonCreator
    OrderEditSetCommentActionImpl(@JsonProperty("comment") final String comment) {
        this.comment = comment;
        this.action = "setComment";
    }
    public OrderEditSetCommentActionImpl() {
        this.action = "setComment";
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public String getComment(){
        return this.comment;
    }

    public void setComment(final String comment){
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        OrderEditSetCommentActionImpl that = (OrderEditSetCommentActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(comment, that.comment)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(comment)
            .toHashCode();
    }

}
