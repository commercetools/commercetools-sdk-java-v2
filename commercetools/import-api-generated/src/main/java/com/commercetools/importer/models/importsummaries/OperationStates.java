package com.commercetools.importer.models.importsummaries;


import com.commercetools.importer.models.importsummaries.OperationStatesImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OperationStatesImpl.class)
public interface OperationStates  {

   /**
   *  <p>The number of import operations that are in the state <code>Accepted</code>.</p>
   */
   @NotNull
   @JsonProperty("Accepted")
   public Integer getAccepted();
   /**
   *  <p>The number of import operations that are in the state <code>ValidationFailed</code>.</p>
   */
   @NotNull
   @JsonProperty("ValidationFailed")
   public Integer getValidationFailed();
   /**
   *  <p>The number of import operations that are in the state <code>Unresolved</code>.</p>
   */
   @NotNull
   @JsonProperty("Unresolved")
   public Integer getUnresolved();
   /**
   *  <p>The number of import operations that are in the state <code>Resolved</code>.</p>
   */
   @NotNull
   @JsonProperty("Resolved")
   public Integer getResolved();
   /**
   *  <p>The number of import operations that are in the state <code>WaitForMasterVariant</code>.</p>
   */
   @NotNull
   @JsonProperty("WaitForMasterVariant")
   public Integer getWaitForMasterVariant();
   /**
   *  <p>The number of import operations that are in the state <code>Imported</code>.</p>
   */
   @NotNull
   @JsonProperty("Imported")
   public Integer getImported();
   /**
   *  <p>The number of import operations that are in the state <code>Deleted</code>.</p>
   */
   @NotNull
   @JsonProperty("Deleted")
   public Integer getDeleted();
   /**
   *  <p>The number of import operations that are in the state <code>Rejected</code>.</p>
   */
   @NotNull
   @JsonProperty("Rejected")
   public Integer getRejected();
   /**
   *  <p>The number of import operations that are in the state <code>Skipped</code>.</p>
   */
   @NotNull
   @JsonProperty("Skipped")
   public Integer getSkipped();
   /**
   *  <p>The number of import operations that are in the state <code>Expired</code>.</p>
   */
   @NotNull
   @JsonProperty("Expired")
   public Integer getExpired();

   public void setAccepted(final Integer accepted);
   
   public void setValidationFailed(final Integer validationFailed);
   
   public void setUnresolved(final Integer unresolved);
   
   public void setResolved(final Integer resolved);
   
   public void setWaitForMasterVariant(final Integer waitForMasterVariant);
   
   public void setImported(final Integer imported);
   
   public void setDeleted(final Integer deleted);
   
   public void setRejected(final Integer rejected);
   
   public void setSkipped(final Integer skipped);
   
   public void setExpired(final Integer expired);
   
   public static OperationStatesImpl of(){
      return new OperationStatesImpl();
   }
   

   public static OperationStatesImpl of(final OperationStates template) {
      OperationStatesImpl instance = new OperationStatesImpl();
      instance.setUnresolved(template.getUnresolved());
      instance.setWaitForMasterVariant(template.getWaitForMasterVariant());
      instance.setValidationFailed(template.getValidationFailed());
      instance.setSkipped(template.getSkipped());
      instance.setImported(template.getImported());
      instance.setExpired(template.getExpired());
      instance.setResolved(template.getResolved());
      instance.setRejected(template.getRejected());
      instance.setDeleted(template.getDeleted());
      instance.setAccepted(template.getAccepted());
      return instance;
   }

}