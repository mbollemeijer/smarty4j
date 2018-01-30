<title>{$title}</title>

{foreach from=$users item=user}
    <li>{$user.name |ucfirst}</li>
    <li>{$user.admin}</li>
    <li>{$user.fakeAttribuut}</li>
    <li>{$user.emptyValue}</li>
{/foreach}
