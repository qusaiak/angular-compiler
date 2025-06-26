import { Component, Input } from '@angular/core';

@Component({
selector: 'app-product-details',
template: `<div *ngIf="product">
<h1>Product Details</h1>
<img src="product.image" alt="{{ product.name }}" width="200px" />
<h2>{{ product.name }}</h2>
<p>{{ product.description }}</p>
</div>
`,
})
export class ProductDetailsComponent {
@Input() product: any;
}
