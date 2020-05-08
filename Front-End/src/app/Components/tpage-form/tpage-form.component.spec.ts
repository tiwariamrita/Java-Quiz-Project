import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TpageFormComponent } from './tpage-form.component';

describe('TpageFormComponent', () => {
  let component: TpageFormComponent;
  let fixture: ComponentFixture<TpageFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TpageFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TpageFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
