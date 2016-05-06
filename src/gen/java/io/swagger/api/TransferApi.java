package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.TransferApiService;
import io.swagger.api.factories.TransferApiServiceFactory;

import io.swagger.annotations.ApiParam;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.InlineResponse200;
import io.swagger.model.ErrorModel;
import io.swagger.model.Transfer;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/transfer")
@Consumes({ "application/json" })
@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the transfer API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2016-01-12T18:02:25.374Z")
public class TransferApi  {
   private final TransferApiService delegate = TransferApiServiceFactory.getTransferApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "create trasfer", response = InlineResponse200.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "transfer response", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = InlineResponse200.class) })

    public Response createTransfer(@ApiParam(value = "external reference for transferrer e.g. merchant ref") @QueryParam("xref") String xref,@ApiParam(value = "The id of recipient the transfer was sent to") @QueryParam("recipient") String recipient,@ApiParam(value = "maximum number of results to return") @QueryParam("amount") Integer amount,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createTransfer(xref,recipient,amount,securityContext);
    }
    @GET
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json", "application/xml", "text/xml", "text/html" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Returns a specific transfer id", response = Transfer.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "transfer object response", response = Transfer.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Entity not found.", response = Transfer.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "unexpected error", response = Transfer.class) })

    public Response findTransferById(@ApiParam(value = "ID of transfer fetch",required=true) @PathParam("id") String id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.findTransferById(id,securityContext);
    }
}
