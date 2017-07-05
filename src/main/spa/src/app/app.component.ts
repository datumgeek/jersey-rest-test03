import { Component } from '@angular/core';
import { Client } from './api-client';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'app works!';
  apiData: any = { "one": "val 1" }

  constructor(private client: Client) {
    this.client.getIt()
      .subscribe((data) => {
        this.apiData = data;
      }, (error) => { alert(`error: ${error}`)});
  }
}
