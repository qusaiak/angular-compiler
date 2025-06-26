@Component({
  selector: 'app-dashboard',
  template: `
    <div class="dashboard">
      <h1>{{ title }}</h1>

      <div *ngIf="user">
        <p>Welcome, {{ user.name }}!</p>
        <button (click)="logout()">Logout</button>
      </div>

      <div *ngIf="!user">
        <label>Username:</label>
        <input [(ngModel)]="loginName" />
        <button (click)="login()">Login</button>
      </div>

      <ul class="cards">
        <li *ngFor="let card of cards" [class.active]="card.active" (click)="selectCard(card)">
          <h4>{{ card.title }}</h4>
          <p>{{ card.description }}</p>
        </li>
      </ul>

      <div *ngIf="selectedCard">
        <h2>Details</h2>
        <p>{{ selectedCard.description }}</p>
      </div>
    </div>
  `
})
export class DashboardComponent {
  title: string = "Dashboard";
  loginName: string = "";
  user: { name: string } | null = null;

  cards = [
    { title: "Card 1", description: "Description for card 1", active: false },
    { title: "Card 2", description: "Description for card 2", active: true },
    { title: "Card 3", description: "Description for card 3", active: false },
  ];

  selectedCard = null;

  login() {
    if (this.loginName) {
      this.user = { name: this.loginName };
      this.loginName = "";
    }
  }

  logout() {
    this.user = null;
    this.selectedCard = null;
  }

  selectCard(card: any) {
    this.selectedCard = card;
  }
}
