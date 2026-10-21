<%@ tag language="java" pageEncoding="UTF-8" %>
<%@ attribute name="product" type="com.shopsphere.model.Product" required="true" %>
<div class="col-md-4 mb-4">
    <div class="card h-100 shadow-sm">
        <div class="card-body">
            <h5 class="card-title fw-bold">${product.name}</h5>
            <h6 class="card-subtitle mb-2 text-muted">${product.brand}</h6>
            <p class="card-text text-truncate">${product.description}</p>
            <div class="d-flex justify-content-between align-items-center mt-3">
                <span class="fs-5 fw-bold text-success">₹${product.price}</span>
                <button class="btn btn-primary btn-sm">Add to Cart</button>
            </div>
        </div>
    </div>
</div>
