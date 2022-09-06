type st = array[1..3] of string[20];
const en: st = ('animal', 'word', 'body');
      ru: st = ('животное', 'слово ', 'тело');
var i: integer;
    s, p: string;
begin
  write('Введите английское слово: ');
  readln(s);
  p := '';
  for i := 1 to 3 do if s = en[i] THEN p := ru[i];
  if p <> ''
    then writeln('Перевод: ', p)
    else writeln('Этого слова нет в словаре')
end.